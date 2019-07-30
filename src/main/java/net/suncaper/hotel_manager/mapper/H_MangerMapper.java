package net.suncaper.hotel_manager.mapper;

import java.util.List;
import net.suncaper.hotel_manager.domain.H_Manger;
import net.suncaper.hotel_manager.domain.H_MangerExample;
import org.apache.ibatis.annotations.Param;

public interface H_MangerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    long countByExample(H_MangerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int deleteByExample(H_MangerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int deleteByPrimaryKey(Integer mId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int insert(H_Manger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int insertSelective(H_Manger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    List<H_Manger> selectByExample(H_MangerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    H_Manger selectByPrimaryKey(Integer mId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") H_Manger record, @Param("example") H_MangerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int updateByExample(@Param("record") H_Manger record, @Param("example") H_MangerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int updateByPrimaryKeySelective(H_Manger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Tue Jul 30 09:29:41 CST 2019
     */
    int updateByPrimaryKey(H_Manger record);
}