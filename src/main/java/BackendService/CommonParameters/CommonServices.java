package BackendService.CommonParameters;

// TODO: Find secure random generator
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.Random;


@Component
public class CommonServices {
    @Autowired
    public JavaMailSender emailSender;

    public String GenerateRandomBytesInString(Integer length) {
        Random rd = new Random();
        byte[] randomBytes = new byte[length];
        // TODO: Use secure random generator
        rd.nextBytes(randomBytes);

        return FromBytesToHexString(randomBytes);
    }

    public byte[] GenerateRandomBytes(Integer length) {
        Random rd = new Random();
        byte[] randomBytes = new byte[length];
        rd.nextBytes(randomBytes);

        return randomBytes;
    }

    public String FromBytesToHexString(byte[] bytesArray) {
        StringBuilder buff = new StringBuilder();
        for (byte b : bytesArray)
            buff.append(String.format("%02X", b));

        return buff.toString();
    }

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("vldmr.rr3@gmail.com");
        mailSender.setPassword("vovkovalev1");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        //props.put("mail.debug", "true");

        return mailSender;
    }

    public void SendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
}
