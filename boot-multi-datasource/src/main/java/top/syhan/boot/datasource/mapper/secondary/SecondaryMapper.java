package top.syhan.boot.datasource.mapper.secondary;

import org.apache.ibatis.annotations.Param;
import top.syhan.boot.datasource.entity.BootUser;

import java.util.List;

/**
 * @description: SecondaryMapper
 * @author: syhan
 * @create: 2022-07-31
 **/
public interface SecondaryMapper {
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
