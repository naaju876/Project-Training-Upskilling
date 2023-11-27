package com.example.Organization.service;

import com.example.Organization.dto.OrganizationDto;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);

    OrganizationDto getOrganizationByCode(String organizationCode);
}
