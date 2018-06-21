package cn.ljh.controller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.ljh.controller.mapper.RegionMapper;
import cn.ljh.controller.po.Region;
import cn.ljh.controller.po.RegionExample;
import cn.ljh.controller.service.RegionService;

@Service("regionService")
public class RegionServiceImpl implements RegionService {

	@Autowired
	private RegionMapper regionMapper;

	@Override
	public List<Region> getRegionList(Region region) {

		RegionExample regionExample = new RegionExample();

		RegionExample.Criteria criteria = regionExample.createCriteria();

		if (!StringUtils.isEmpty(region.getRegionKind())) {
			criteria.andRegionKindEqualTo(region.getRegionKind());
		}

		if (!StringUtils.isEmpty(region.getRegionProvinceCode())) {
			criteria.andRegionProvinceCodeEqualTo(region.getRegionProvinceCode());
		}

		if (!StringUtils.isEmpty(region.getRegionCityCode())) {
			criteria.andRegionCityCodeEqualTo(region.getRegionCityCode());
		}

		if (!StringUtils.isEmpty(region.getRegionCountyCode())) {
			criteria.andRegionCountyCodeEqualTo(region.getRegionCountyCode());
		}

		regionExample.setOrderByClause(
				"region_kind asc,region_province_code asc,region_city_code asc,region_county_code asc");

		List<Region> regions = regionMapper.selectByExample(regionExample);

		return regions;
	}

}
