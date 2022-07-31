package top.syhan.boot.datasource.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.syhan.boot.datasource.entity.BootUser;
import top.syhan.boot.datasource.mapper.primary.PrimaryMapper;
import top.syhan.boot.datasource.mapper.secondary.SecondaryMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: BootUserService
 * @author: syhan
 * @create: 2022-07-31
 **/
@Service
public class BootUserService {
    @Resource
    private PrimaryMapper primaryMapper;
    @Resource
    private SecondaryMapper secondaryMapper;

    public List<BootUser> getUsers() {
        List<BootUser> primaryUsers = primaryMapper.selectAll();
        List<BootUser> secondaryUsers = secondaryMapper.selectAll();
        List<BootUser> result = new ArrayList<>();
        result.addAll(primaryUsers);
        result.addAll(secondaryUsers);
        return result;
    }

    @Transactional(rollbackFor = {RuntimeException.class})
    public void saveUser(BootUser bootUser) {
        primaryMapper.insert(bootUser);
        //int a = 2 / 0;
        secondaryMapper.insert(bootUser);
    }
}

