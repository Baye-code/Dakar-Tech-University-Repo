package com.saraya.DakarTechUniversity.email;




import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailInfoService{
	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
    private final static Logger LOGGER = LoggerFactory
            .getLogger(EmailContactService.class);

	
    @Async
	public void send(String to, String email) {
    	
		try {
			
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper =
                    new MimeMessageHelper(mimeMessage, true);
            helper.setText(email, true);
            helper.setTo(to);
            helper.setSubject("Request information ");
            FileSystemResource file = new FileSystemResource("D:\\Downloads\\Documents\\PrestFTP.pdf");
            helper.addAttachment(file.getFilename(), file);
            helper.setFrom("layendiaye195@gmail.com");
            mailSender.send(mimeMessage);
            
        } catch (MessagingException e) {
            LOGGER.error("failed to send email", e);
            throw new IllegalStateException("failed to send email");
        }
		
	}


}