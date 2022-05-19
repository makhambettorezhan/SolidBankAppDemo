CREATE TABLE Account
(
    account_id INTEGER  NOT NULL,
    account_type NVARCHAR(40)  NOT NULL,
    client_id NVARCHAR(80),
    balance NUMBER(10),
    withdraw_allowed INTEGER,
    CONSTRAINT PK_Account PRIMARY KEY  (account_id)
);

insert into Account (account_id, account_type, client_id, balance, withdraw_allowed)
VALUES (1, 'FIXED', '1', 0, 0);

insert into Account (account_id, account_type, client_id, balance, withdraw_allowed)
VALUES (2, 'FIXED', '1', 0, 0);
