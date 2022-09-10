package es.gogroup.batchlaboral.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
@Slf4j
public class MailService {

    private JavaMailSender javaMailSender;

    /**
     * Sends a mail with attachment
     */
    //public void sendXlsByMail(Path attachment, List<String> cco){
    public void sendXlsByMail(String toEmail, String body, String subject, String attachment) throws MessagingException {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper= new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom("no-reply@autowired.tech");
        mimeMessageHelper.setTo(toEmail);
        mimeMessageHelper.setText(body);
        mimeMessageHelper.setSubject(subject);

        FileSystemResource fileSystemResource = new FileSystemResource(new File(attachment));
        mimeMessageHelper.addAttachment(fileSystemResource.getFilename(),fileSystemResource);
        javaMailSender.send(mimeMessage);

        System.out.println("Mail with attachmente sent succesfully.");
    }

}
