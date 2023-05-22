CREATE TABLE Credit (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  credit_code UUID NOT NULL UNIQUE,
  credit_value DECIMAL(19, 2) NOT NULL,
  day_first_installment DATE NOT NULL,
  number_of_installments INT NOT NULL,
  status VARCHAR(50),
  customer_id BIGINT,
  FOREIGN KEY (customer_id) REFERENCES Cliente (id) ON DELETE CASCADE ON UPDATE CASCADE
);