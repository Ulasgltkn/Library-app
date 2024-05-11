package com.ulasgultekin.LibraryManagementProject.mapper;

import com.ulasgultekin.LibraryManagementProject.dto.request.BookForBorrowingRequest;
import com.ulasgultekin.LibraryManagementProject.entity.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookForBorrowingMapper {

    Book asEntity(BookForBorrowingRequest bookForBorrowingRequest);
}
