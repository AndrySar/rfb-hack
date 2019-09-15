package ru.rfb.hack.repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class InsertDataRepository {

    private static final String INSERT_ORGANIZATION = "" +
        "INSERT INTO organizations " +
        "(number, id, organization_name, category, postcode, country, region, area, city, street, house, address, mobile_phone, phone, site, schedule, lat, lon, network_id, network, services, social_networks, organization_card, all_sites, all_phone, level_1, level_2) " +
        "VALUES " +
        "( :number, :id, :organization_name, :category, :postcode, :country, :region, :area, :city, :street, :house, :address, :mobile_phone, :phone, :site, :schedule, :lat, :lon, :network_id, :network, :services, :social_networks, :organization_card, :all_sites, :all_phone, :level_1, :level_2 ) ";

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public InsertDataRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertOrganizations(List<Map<String, Object>> organizations) {
        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(organizations);
        jdbcTemplate.batchUpdate(INSERT_ORGANIZATION, batch);
    }
}
