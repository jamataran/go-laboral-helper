package es.gogroup.batchlaboral.service;

import static org.apache.poi.ss.util.CellUtil.createCell;

import es.gogroup.batchlaboral.entity.FosUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ExcelService {

    public static final String PERSONAL_GO = "PERSONAL_GO";

    /**
     * Generates excel file from user list
     * @param usuarios Users
     * @param path Path to generate
     */
    public void generateExcelFromUsers(List<FosUser> usuarios, Path path) throws IOException {
        log.debug("Generating xls file from {} in {}", usuarios, path);

        // Crea el libro.
        Workbook workbook = new XSSFWorkbook();

        // Crea la hoja y ajusta anchos de columnas.
        Sheet sheet = workbook.createSheet(PERSONAL_GO);
        sheet.setColumnWidth(0, 6000);
        sheet.setColumnWidth(1, 4000);

        // Crea la cabecera. TODO: Resto de datos..
        Row header = sheet.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Times New Roman");
        font.setFontHeightInPoints((short) 12);
        font.setBold(true);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("NOMBRE");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(1);
        headerCell.setCellValue("APELLIDOS");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(2);
        headerCell.setCellValue("TELEFONO");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(3);
        headerCell.setCellValue("DNI");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(4);
        headerCell.setCellValue("NUMERO_SEGURIDAD_SOCIAL");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(5);
        headerCell.setCellValue("FECHA_NACIMIENTO");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(6);
        headerCell.setCellValue("DIRECCION");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(7);
        headerCell.setCellValue("LOCALIDAD");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(8);
        headerCell.setCellValue("PROVINCIA");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(9);
        headerCell.setCellValue("CP");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(10);
        headerCell.setCellValue("PAIS");
        headerCell.setCellStyle(headerStyle);

        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);

        // Contenido. TODO: Meter la lista de usuarios que recibimos.
        int rowCount =1;

        for (FosUser fosUser: usuarios){
            Row row =sheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, fosUser.getNombre(),style);
            createCell(row, columnCount++, fosUser.getApellidos(),style);
            createCell(row, columnCount++, fosUser.getTelefono(),style);
            createCell(row, columnCount++, fosUser.getDni(),style);
            createCell(row, columnCount++, fosUser.getNSs(),style);
            createCell(row, columnCount++, fosUser.getFechaNacimiento(),style);
            createCell(row, columnCount++, fosUser.getDireccion(),style);
            createCell(row, columnCount++, fosUser.getLocalidad(),style);
            createCell(row, columnCount++, fosUser.getProvincia(),style);
            createCell(row, columnCount++, fosUser.getCp(),style);
            createCell(row, columnCount++, fosUser.getPais(),style);
        }

        /**Row row = sheet.createRow(2);
        Cell cell = row.createCell(0);
        cell.setCellValue("John Smith");
        cell.setCellStyle(style);


        cell = row.createCell(1);
        cell.setCellValue(20);
        cell.setCellStyle(style);*/

        // Escribir el libro.
        File currDir = new File(".");
        String cPath = currDir.getAbsolutePath();
        String fileLocation = cPath.substring(0, cPath.length() - 1) + "prueba.xlsx";

        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        workbook.write(outputStream);
        workbook.close();
    }

    /**
     * Delete excel file.
     * @param path Excel path
     */
    public void deleteExcelFile(Path path){
        // TODO
    }


}
