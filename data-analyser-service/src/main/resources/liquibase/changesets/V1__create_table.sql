CREATE TABLE IF NOT EXISTS data (
    id bigserial primary key,
    sensor_id bigint not null,
    timestamp timestamp not null,
    measurement float not null,
    type varchar(25) not null
);