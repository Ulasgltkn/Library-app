package com.ulasgultekin.LibraryManagementProject.mapper;

import com.ulasgultekin.LibraryManagementProject.dto.request.BookBorrowingRequest;
import com.ulasgultekin.LibraryManagementProject.dto.request.BookBorrowingUpdateRequest;
import com.ulasgultekin.LibraryManagementProject.entity.BookBorrowing;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BookBorrowingMapper {

    BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest);

    BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest);

    void update(@MappingTarget BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest);
}
