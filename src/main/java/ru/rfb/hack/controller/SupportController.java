//package ru.rfb.hack.controller;

import com.opencsv.CSVReader;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.rfb.hack.repository.InsertDataRepository;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SupportController {

    private static final String COMMA_DELIMITER = ",";

    private final static Logger log = LoggerFactory.getLogger(SupportController.class);

    @Autowired
    private InsertDataRepository insertDataRepository;

    @GetMapping("/insert")
    public void insertCsvFile(@RequestParam String path) {
        log.info("Insert csv file {}", path);

        try {
            int count = 0;
            FileReader filereader = new FileReader(path);
            List<Map<String, Object>> records = new ArrayList<>();

            try (CSVReader csvReader = new CSVReader(filereader)) {
                String[] values;

                while ((values = csvReader.readNext()) != null) {

                    while ((values = csvReader.readNext()) != null && count < 1) {
                        try {

                            Map<String, Object> map = new HashMap<>();

                            map.put("number", values[0]);
                            map.put("id", Double.valueOf(values[1]).longValue());
                            map.put("organization_name", values[2]);
                            map.put("category", values[3]);
                            map.put("postcode", StringUtils.isNotEmpty(values[4]) ? Double.valueOf(values[4]).longValue() : 0);
                            map.put("country", values[5]);
                            map.put("region", values[6]);
                            map.put("area", values[7]);
                            map.put("city", values[8]);
                            map.put("street", values[9]);
                            map.put("house", values[10]);
                            map.put("address", values[11]);
                            map.put("mobile_phone", values[12]);
                            map.put("phone", values[13]);
                            map.put("site", values[14]);
                            map.put("schedule", values[15]);
                            map.put("lat", values[16]);
                            map.put("lon", values[17]);
                            map.put("network_id", values[18]);
                            map.put("network", values[19]);
                            map.put("services", values[20]);
                            map.put("social_networks", values[21]);
                            map.put("organization_card", values[22]);
                            map.put("all_sites", values[23]);
                            map.put("all_phone", values[24]);
                            map.put("level_1", StringUtils.isNotEmpty(values[25]) ? Double.valueOf(values[25]) : 0.0);
                            map.put("level_2", StringUtils.isNotEmpty(values[26]) ? Double.valueOf(values[26]) : 0.0);

                            records.add(map);
                            count++;
                        } catch (Exception ex) {
                            log.warn(ex.getMessage());
                        }

                    }

                    insertDataRepository.insertOrganizations(records);
                    count = 0;
                }

            } catch (Exception e) {
                log.error(e.getMessage());
            }
        } catch (IOException io) {
            log.error(io.getMessage());
        }
    }
}
