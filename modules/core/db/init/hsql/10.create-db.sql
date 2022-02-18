-- begin CUBAPOLIGON_ORDER
create table CUBAPOLIGON_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36),
    DATE_ date,
    AMOUNT decimal(19, 2),
    NUMBER_ varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUBAPOLIGON_ORDER
-- begin CUBAPOLIGON_CUSTOMER
create table CUBAPOLIGON_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    EMAIL почта,
    --
    primary key (ID)
)^
-- end CUBAPOLIGON_CUSTOMER
-- begin CUBAPOLIGON_STRORE
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
)^
-- end CUBAPOLIGON_STRORE
-- begin CUBAPOLIGON_PRODUCT
create table CUBAPOLIGON_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end CUBAPOLIGON_PRODUCT
-- begin CUBAPOLIGON_ORDER_LINE
create table CUBAPOLIGON_ORDER_LINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36) not null,
    QUANTITY integer not null,
    ORDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CUBAPOLIGON_ORDER_LINE
