package org.example.postproject.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/**
 * Postni ham get ham update uchun qo'llanilgan dto
 */
public class PostGetDto {
    private UUID id;
    private String title;
    private String content;
}
