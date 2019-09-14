package ru.rfb.hack.repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.rfb.hack.domain.entity.Organization;
import ru.rfb.hack.domain.entity.UserEntity;
import ru.rfb.hack.domain.model.Coordinate;

import java.util.Collection;
import java.util.List;

@Repository
public class JdbcOrganizationRepository {

    private static final String ORGANIZATION_NAME = "organization_name";
    private static final String CATEGORIES = "categories";
    private static final String LAT = "lat";
    private static final String LON = "lon";

    private static final String FIND_ORGANIZATION_BY_COORDINATES = "" +
        "SELECT organization_name, category AS categories, lat, lon " +
        "FROM organizations " +
        "WHERE lat >= :latBelow AND lat <= :latAbove AND " +
        "      lon >= :lonBelow AND lon <= :lonAbove AND ";

    private static final String FIND_ORGANIZATION_BY_COORDINATES_AND_CATEGORIES = "" +
        "SELECT organization_name, category AS categories, lat, lon " +
        "FROM organizations " +
        "WHERE lat >= :latBelow AND lat <= :latAbove AND " +
        "      lon >= :lonBelow AND lon <= :lonAbove AND " +
        "      category IN (:categories) ";

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public JdbcOrganizationRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Organization> findOrganizationsByCoordinates(Coordinate coordinateAbove, Coordinate coordinateBelow) {
        return jdbcTemplate.query(
            FIND_ORGANIZATION_BY_COORDINATES,
            new MapSqlParameterSource()
                .addValue("latBelow", coordinateBelow.getLat().toString())
                .addValue("latAbove", coordinateAbove.getLat().toString())
                .addValue("lonBelow", coordinateBelow.getLon().toString())
                .addValue("lonAbove", coordinateAbove.getLon().toString()),
            (rs, rowNum) -> new Organization(
                rs.getString(ORGANIZATION_NAME),
                rs.getString(CATEGORIES),
                rs.getString(LAT),
                rs.getString(LON)
            )
        );
    }

    public List<Organization> findOrganizationsByCoordinatesAndCategories(List<String> categories, Coordinate coordinateAbove, Coordinate coordinateBelow) {
        return jdbcTemplate.query(
            FIND_ORGANIZATION_BY_COORDINATES_AND_CATEGORIES,
            new MapSqlParameterSource()
                .addValue("latBelow", coordinateBelow.getLat().toString())
                .addValue("latAbove", coordinateAbove.getLat().toString())
                .addValue("lonBelow", coordinateBelow.getLon().toString())
                .addValue("lonAbove", coordinateAbove.getLon().toString())
                .addValue("categories", categories),
            (rs, rowNum) -> new Organization(
                rs.getString(ORGANIZATION_NAME),
                rs.getString(CATEGORIES),
                rs.getString(LAT),
                rs.getString(LON)
            )
        );
    }
}
