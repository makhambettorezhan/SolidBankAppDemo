CREATE TABLE Account
(
    account_id INTEGER  NOT NULL,
    account_type NVARCHAR(40)  NOT NULL,
    client_id NVARCHAR(80),
    balance NUMBER(10),
    withdraw_allowed INTEGER,
    CONSTRAINT PK_Account PRIMARY KEY  (account_id)
);

CREATE TABLE Transaction
(
    id INTEGER NOT NULL,
    transaction_type NVARCHAR(40)  NOT NULL,
    client_id NVARCHAR(80),
    account_id INTEGER,
    balance NUMBER(10),
    CONSTRAINT PK_Transaction PRIMARY KEY  (id)
);