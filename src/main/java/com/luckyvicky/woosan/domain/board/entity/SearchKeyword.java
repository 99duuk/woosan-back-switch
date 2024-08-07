package com.luckyvicky.woosan.domain.board.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Data
@Document(indexName = "search_keywords")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchKeyword {

    @Id
    private String id;

    @Field(type = FieldType.Keyword)
    private String keyword;

    @Field(type = FieldType.Date, format = DateFormat.date_time)
    private LocalDateTime timestamp;

}
