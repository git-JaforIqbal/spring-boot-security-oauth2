--------------------------------------------------------
--  File created - Sunday-September-29-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table OAUTH_REFRESH_TOKEN
--------------------------------------------------------

  CREATE TABLE "HR"."OAUTH_REFRESH_TOKEN" 
   (	"TOKEN_ID" VARCHAR2(256 BYTE), 
	"TOKEN" BLOB, 
	"AUTHENTICATION" BLOB
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" 
 LOB ("TOKEN") STORE AS BASICFILE (
  TABLESPACE "USERS" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("AUTHENTICATION") STORE AS BASICFILE (
  TABLESPACE "USERS" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;
REM INSERTING into HR.OAUTH_REFRESH_TOKEN
SET DEFINE OFF;
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('0d56d13813db3c3c19e253bc89e1c45b');
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('c93930a9bf85ad75a762873f23f6755f');
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('31477783f7fa1026fc1ab2deea09266e');
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('9bd3086a3db6f2b4ac53fe012e335bde');
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('385558592e8d848396b4a9f894d288eb');
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('76c7820692a683efa42d28603c89dde6');
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('29eca708990dbf1875fe9608cf58c723');
Insert into HR.OAUTH_REFRESH_TOKEN (TOKEN_ID) values ('dd74f26603fa6d69195cc47c18200754');
