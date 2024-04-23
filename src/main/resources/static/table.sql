CREATE TABLE `mobile_food_facility_permit` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `locationId` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'locationid',
  `applicant` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'applicant',
  `facilityType` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'FacilityType',
  `cnn` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'cnn',
  `locationDescription` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'LocationDescription',
  `address` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'Address',
  `blocklot` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'blocklot',
  `block` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'block',
  `lot` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'lot',
  `permit` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'permit',
  `status` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'Status',
  `foodItems` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'FoodItems',
  `siteX` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'X',
  `siteY` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'Y',
  `latitude` double(16,8) DEFAULT NULL COMMENT 'Latitude',
  `longitude` double(16,8) DEFAULT NULL COMMENT 'Longitude',
  `schedule` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'Schedule',
  `dayshours` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'dayshours',
  `createTime` datetime DEFAULT NULL COMMENT 'createTime',
  `updateTime` datetime DEFAULT NULL COMMENT 'updateTime',
  `createUser` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'createUser',
  `updateUser` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL COMMENT 'updateUser',
  PRIMARY KEY (`id`),
  KEY `indx_applicant_foodtruck` (`applicant`),
  KEY `indx_foodItem_foodtruck` (`foodItems`),
  KEY `indx_lat_long_foodtruck` (`latitude`,`longitude`)
) ENGINE=InnoDB AUTO_INCREMENT=630 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;