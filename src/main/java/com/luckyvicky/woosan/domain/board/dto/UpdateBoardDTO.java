package com.luckyvicky.woosan.domain.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBoardDTO {
    private Long id;
    private Long writerId;

    private String title;
    private String content;
    private LocalDateTime regDate;
    private String categoryName;

    private List<MultipartFile> images;
    private List<String> filePathUrl;
}
