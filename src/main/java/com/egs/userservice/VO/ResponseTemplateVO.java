package com.egs.userservice.VO;

import com.egs.userservice.entity.User1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private User1 user1;
    private Department department;

}
