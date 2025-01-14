package cc.mrbird.febs.cos.service;

import cc.mrbird.febs.cos.entity.RentInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;

/**
 * @author FanK
 */
public interface IRentInfoService extends IService<RentInfo> {

    /**
     * 分页获取出租信息信息
     *
     * @param page 分页对象
     * @param rentInfo 出租信息信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectRentPage(Page<RentInfo> page, RentInfo rentInfo);
}
