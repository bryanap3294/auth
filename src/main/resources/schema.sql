CREATE TABLE IF NOT EXISTS USER (
  USERNAME VARCHAR(20) NOT NULL PRIMARY KEY,
  PASSWORD VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS OAUTH_CLIENT_DETAILS (
  client_id VARCHAR(256) NOT NULL PRIMARY KEY,
  resource_ids VARCHAR(256),
  client_secret VARCHAR(256) NOT NULL,
  scope VARCHAR(256),
  authorized_grant_types VARCHAR(256),
  web_server_redirect_uri VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INT,
  refresh_token_validity INT,
  additional_information VARCHAR(4000),
  autoapprove VARCHAR(256)
);