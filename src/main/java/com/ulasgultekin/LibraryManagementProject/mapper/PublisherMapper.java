package com.ulasgultekin.LibraryManagementProject.mapper;

import com.ulasgultekin.LibraryManagementProject.dto.response.PublisherResponse;
import com.ulasgultekin.LibraryManagementProject.entity.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);

    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
