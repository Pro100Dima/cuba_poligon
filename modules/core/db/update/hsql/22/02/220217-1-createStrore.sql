create table CUBAPOLIGON_STRORE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS_CITY varchar(255),
    ADDRESS_STREET varchar(255),
    ADDRESS_NUMBER_ varchar(255),
    --
    NAME varchar(255) not null,
    STORE_TYPE integer,
    --
    primary key (ID)
);