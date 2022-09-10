package es.gogroup.batchlaboral;

import es.gogroup.batchlaboral.entity.FosUser;
import es.gogroup.batchlaboral.service.ExcelService;
import es.gogroup.batchlaboral.service.FosUserService;
import es.gogroup.batchlaboral.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@SpringBootApplication
@Controller
public class BatchLaboralApplication implements CommandLineRunner {

	private final FosUserService service;
	private final ExcelService excelService;
	private final MailService mailService;

	public BatchLaboralApplication(FosUserService service,
								   ExcelService excelService,
								   MailService mailService) {
		this.service = service;
		this.excelService = excelService;
		this.mailService = mailService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BatchLaboralApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("Iniciando proceso batch...");

		// Obtener todos los usuarios.
		List<FosUser> allUsers = this.service.getAllUsers();
		log.debug("Usuarios obtenidos = {}", allUsers);

		// Generar excel.
		// TODO.
		this.excelService.generateExcelFromUsers(allUsers, null);

		// Enviar excel por mail.
		//TODO
		//this.mailService.sendXlsByMail(null, Collections.singletonList("mail@gmail.com"));
		this.mailService.sendXlsByMail("luisrym@gamil.com","This is body", "This is Email with attachment", "/Users/luisrope/Users/luisroperodoval/Desktop/prueba.xlsxrodoval/");
		// Borrar fichero
		this.excelService.deleteExcelFile(null);

		log.debug("Finalizado proceso batch");
	}

	/**
	 * Dummy method to show h2 console.
	 * FIXME: Delete this method.
	 * @return
	 */
	@GetMapping("/")
	public int get0(){
		return 0;
	}
}
