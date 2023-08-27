CREATE TABLE service_request (
    id INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    service_id INT,
    FOREIGN KEY (service_id) REFERENCES service(id)
);
