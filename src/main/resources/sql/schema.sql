CREATE TABLE `crypto_automation`.`report_histories` (
    `id` BINARY(16) NOT NULL,
    `market` VARCHAR(45) NOT NULL,
    `price` VARCHAR(45) NOT NULL,
    `reported_at` DATETIME NOT NULL,
    PRIMARY KEY (`id`);
)