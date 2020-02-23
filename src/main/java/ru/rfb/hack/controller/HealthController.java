package ru.rfb.hack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HealthController {

    private final static Logger log = LoggerFactory.getLogger(HealthController.class);
    private final JdbcTemplate jdbcTemplate;

    public HealthController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/")
    public String healthCheck() {
        log.info("Health check Ok;");
        return "Ok;";
    }

    @GetMapping("/load")
    public String loadTable() {
        List<MapSqlParameterSource> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/andrei/msk.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",", -1);
                List<String> list = Arrays.asList(values);
                MapSqlParameterSource sqlMap = new MapSqlParameterSource();
                sqlMap.addValue("number", list.get(0));
                sqlMap.addValue("id", list.get(1));
                sqlMap.addValue("organization_name", Integer.valueOf(list.get(2)));
                sqlMap.addValue("category", list.get(3));
                sqlMap.addValue("postcode", Integer.valueOf(list.get(4)));
                sqlMap.addValue("country", list.get(5));
                sqlMap.addValue("region", list.get(6));
                sqlMap.addValue("area", list.get(7));
                sqlMap.addValue("city", list.get(8));
                sqlMap.addValue("street", list.get(9));
                sqlMap.addValue("house", list.get(10));
                sqlMap.addValue("address", list.get(11));
                sqlMap.addValue("mobile_phone", list.get(12));
                sqlMap.addValue("phone", list.get(13));
                sqlMap.addValue("site", list.get(14));
                sqlMap.addValue("schedule", list.get(15));
                sqlMap.addValue("lat", list.get(16));
                sqlMap.addValue("lon", list.get(17));
                sqlMap.addValue("network_id", list.get(18));
                sqlMap.addValue("network", list.get(19));
                sqlMap.addValue("service", list.get(20));
                sqlMap.addValue("social_networks", list.get(21));
                sqlMap.addValue("organization_card", list.get(22));
                sqlMap.addValue("all_sites", list.get(23));
                sqlMap.addValue("all_phone", list.get(24));
                sqlMap.addValue("level_1", Float.valueOf(list.get(25)));
                sqlMap.addValue("level_2", Float.valueOf(list.get(26)));
                records.add(sqlMap);
            }

            SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate).withTableName("organizations");
            MapSqlParameterSource[] array = new MapSqlParameterSource[records.size()];
            records.toArray(array);
            insert.executeBatch(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Ok;";
    }
}
