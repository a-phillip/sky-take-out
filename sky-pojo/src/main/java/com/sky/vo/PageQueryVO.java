package com.sky.vo;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageQueryVO {
    @ApiModelProperty("名字")
    public String name;
    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("电话")
    public String phone;
    @ApiModelProperty("状态")
    public Short status;
    @ApiModelProperty("更新时间")
    public LocalDateTime updateTime;
}
