package es.gogroup.batchlaboral.service;

import es.gogroup.batchlaboral.entity.FosUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.util.List;

@Service
@Slf4j
public class ExcelService {

    /**
     * Generates excel file from user list
     * @param usuarios Users
     * @param path Path to generate
     */
    public void generateExcelFromUsers(List<FosUser> usuarios, Path path){
        log.debug("Generating xls file from {} in {}", usuarios, path);
        // TODO.
    }

    /**
     * Delete excel file.
     * @param path Excel path
     */
    public void deleteExcelFile(Path path){
        // TODO
    }


}
