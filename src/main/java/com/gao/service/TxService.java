package com.gao.service;

import com.gao.entity.Tx;
import java.util.List;

/**
 * (Tx)表服务接口
 *
 * @author makejava
 * @since 2020-04-15 13:04:33
 */
public interface TxService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Tx queryById( );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tx> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tx 实例对象
     * @return 实例对象
     */
    Tx insert(Tx tx);

    /**
     * 修改数据
     *
     * @param tx 实例对象
     * @return 实例对象
     */
    Tx update(Tx tx);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}