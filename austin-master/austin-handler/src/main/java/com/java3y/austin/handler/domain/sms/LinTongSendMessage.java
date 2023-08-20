package com.java3y.austin.handler.domain.sms;

import lombok.Builder;
import lombok.Data;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * 
 * @Description
 * @see com.java3y.austin.handler.domain.sms austin
 */
@Data
@Builder
public class LinTongSendMessage {
    String phone;
    String content;
}
