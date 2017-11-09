package bi.baiqiu.mapper;

import bi.baiqiu.pojo.AddressVerification;
import bi.baiqiu.pojo.AddressVerificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressVerificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_address_verification
     *
     * @mbggenerated Fri Oct 27 17:37:03 CST 2017
     */
    int countByExample(AddressVerificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_address_verification
     *
     * @mbggenerated Fri Oct 27 17:37:03 CST 2017
     */
    int deleteByExample(AddressVerificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_address_verification
     *
     * @mbggenerated Fri Oct 27 17:37:03 CST 2017
     */
    int insert(AddressVerification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_address_verification
     *
     * @mbggenerated Fri Oct 27 17:37:03 CST 2017
     */
    int insertSelective(AddressVerification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_address_verification
     *
     * @mbggenerated Fri Oct 27 17:37:03 CST 2017
     */
    List<AddressVerification> selectByExample(AddressVerificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_address_verification
     *
     * @mbggenerated Fri Oct 27 17:37:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") AddressVerification record, @Param("example") AddressVerificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_address_verification
     *
     * @mbggenerated Fri Oct 27 17:37:03 CST 2017
     */
    int updateByExample(@Param("record") AddressVerification record, @Param("example") AddressVerificationExample example);
}