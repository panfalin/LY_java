package com.ruoyi.common.service;

import com.ruoyi.common.utils.email.PxEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class EmailService {

    @Resource
    private JavaMailSender mailSender;

    /**
     * 发送邮件
     * @param email 邮件对象
     * @throws MessagingException 异常
     */
    public void sendEmail(PxEmail email) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        // 设置邮件信息
        helper.setFrom(email.getFormEmail());
        helper.setTo(email.getReceiverEmail());
        if (email.getCcEmail() != null) {
            helper.setCc(email.getCcEmail().split(","));
        }
        helper.setSubject(email.getSubject());
        helper.setText(email.getContent(), true);

        // 发送邮件
        mailSender.send(mimeMessage);
        System.out.println("邮件已成功发送!");
    }
}