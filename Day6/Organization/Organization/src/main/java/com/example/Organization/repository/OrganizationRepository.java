package com.example.Organization.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Organization.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}
