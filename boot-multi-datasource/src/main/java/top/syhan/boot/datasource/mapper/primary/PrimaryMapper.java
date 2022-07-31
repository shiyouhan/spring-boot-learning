package top.syhan.boot.datasource.mapper.primary;

import org.apache.ibatis.annotations.Param;
import top.syhan.boot.datasource.entity.BootUser;

import java.util.List;

/**
 * @description: PrimaryMapper
 * @author: syhan
 * @create: 2022-07-31
 **/
public interface PrimaryMapper {
    /**
     * 查询所有数据
     *
     * @return List<BootUser>
     */
    List<BootUser> selectAll();

    /**
     * 新增
     *
     * @param bootUser 入参
     */
    void insert(@Param("bootUser") BootUser bootUser);
}
