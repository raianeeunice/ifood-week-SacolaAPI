package raiane.dio.sacola.service;

import raiane.dio.sacola.model.Item;
import raiane.dio.sacola.model.Sacola;
import raiane.dio.sacola.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
