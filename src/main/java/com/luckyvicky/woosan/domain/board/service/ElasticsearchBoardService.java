package com.luckyvicky.woosan.domain.board.service;

import com.luckyvicky.woosan.domain.board.dto.BoardPageResponseDTO;
import com.luckyvicky.woosan.domain.board.entity.Board;
import com.luckyvicky.woosan.global.util.PageRequestDTO;

import java.util.List;

public interface ElasticsearchBoardService {

    BoardPageResponseDTO searchByCategoryAndFilter(String categoryName, String filterType, String keyword, PageRequestDTO pageRequestDTO);
}
