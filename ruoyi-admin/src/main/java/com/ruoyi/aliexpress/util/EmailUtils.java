package com.ruoyi.aliexpress.util;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Properties;

public class EmailUtils {
    // 发送邮件的方法
    public static void sendEmailWithAttachment(String toEmail, String subject, String body, String attachmentPath) throws MessagingException, IOException {
        String fromEmail = "3004188570@qq.com";  // 发件人邮件
        String host = "smtp.qq.com";  // 邮件服务器地址

        // 配置邮件服务器
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  // 启用 SSL
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");

        // 获取 Session 对象
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("3004188570@qq.com", "odwrbqabjrevdfia");  // 使用你的邮箱和密码
            }
        });

        // 创建 MimeMessage 对象
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
        message.setSubject(subject);
        message.setText(body);

        // 创建附件部分
        MimeBodyPart attachmentPart = new MimeBodyPart();
        attachmentPart.attachFile(attachmentPath);

        // 创建 Multipart 来包含邮件内容和附件
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(attachmentPart);

        // 设置邮件内容
        message.setContent(multipart);

        // 发送邮件
        Transport.send(message);
    }
}
