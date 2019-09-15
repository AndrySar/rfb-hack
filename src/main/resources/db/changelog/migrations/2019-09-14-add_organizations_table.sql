-- auto-generated definition

--changeset msa:add_organization_table
create table organizations
(
    number               varchar(100),
    id                   bigint not null,
    organization_name    varchar(100) default ''::character varying,
    category             varchar(100) default ''::character varying,
    postcode             bigint       default 0,
    country              varchar(50)  default 'Страна'::character varying,
    region               varchar(50)  default 'Регион'::character varying,
    area                 varchar(50)  default ''::character varying,
    city                 varchar(50)  default ''::character varying,
    street               varchar(50),
    house                varchar(20),
    address              varchar(200),
    mobile_phone         varchar(20),
    phone                varchar(150),
    site                 varchar(200),
    schedule             varchar(100),
    lat                  varchar(20),
    lon                  varchar(20),
    network_id           varchar(100),
    network              varchar(200),
    services             text,
    social_networks      text,
    organization_card    varchar(100),
    all_sites            text,
    all_phone            text,
    level_1              real,
    level_2              real
);

alter table organizations
    owner to rfb_hack;