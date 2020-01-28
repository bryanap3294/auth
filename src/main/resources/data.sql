INSERT INTO USER (USERNAME, PASSWORD) VALUES ('bryanap', 'bryan123');
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('jordanap', 'jordan123');

INSERT INTO OAUTH_CLIENT_DETAILS
    (client_id, client_secret, scope, authorized_grant_types,
    authorities, access_token_validity, refresh_token_validity)
VALUES('my-application', '$2a$08$R6PfyoB2PF59Q5iHjjZf0e6ATB0i1Mm9eOzW7mfNECvxGsfe2ZRjy', 'read,write', 'authorization_code,check_token,refresh_token,password,client_credentials',
    'ROLE_CLIENT', 3600, 36000);