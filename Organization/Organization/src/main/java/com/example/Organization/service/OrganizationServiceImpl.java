package com.example.Organization.service;

import lombok.AllArgsConstructor;


import org.springframework.stereotype.Service;

import com.example.Organization.dto.OrganizationDto;
import com.example.Organization.entity.Organization;
import com.example.Organization.mapper.OrganizationMapper;
import com.example.Organization.repository.OrganizationRepository;

@Service
@AllArgsConstructor

public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}

