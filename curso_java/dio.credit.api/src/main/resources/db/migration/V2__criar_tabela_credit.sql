CREATE TABLE Credit (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  creditCode UUID NOT NULL UNIQUE,
  creditValue DECIMAL(19, 2) NOT NULL,
  dayFirstInstallment DATE NOT NULL,
  numberOfInstallments INT NOT NULL,
  status VARCHAR(50),
  customer_id BIGINT,
  FOREIGN KEY (customer_id) REFERENCES Cliente (id) ON DELETE CASCADE ON UPDATE CASCADE
);