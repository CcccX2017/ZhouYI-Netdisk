package cn.codex.netdisk.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 好友表
 * </p>
 *
 * @author codex
 * @since 2021-02-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_friends")
@ApiModel(value="Friends对象", description="好友表")
public class Friends implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "好友用户名")
    private String friend;

    @ApiModelProperty(value = "用户给好友的备注")
    private String userToFriendRemark;

    @ApiModelProperty(value = "好友给用户的备注")
    private String friendToUserRemark;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


    public static final String ID = "id";

    public static final String USERNAME = "username";

    public static final String FRIEND = "friend";

    public static final String USER_TO_FRIEND_REMARK = "user_to_friend_remark";

    public static final String FRIEND_TO_USER_REMARK = "friend_to_user_remark";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

}
