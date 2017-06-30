package com.andrey7mel.testrx.view;

import com.andrey7mel.testrx.model.data.Repo;

import java.util.List;

public interface View {
// View - слой отображения, содержит все view элементы, активити, фрагменты и прочее.

// View реализуем как Activity, которое умеет отображать полученные данные,
// показывать ошибку, уведомлять о пустом списке и в
// ыдавать имя пользователя по запросу от презентера.

    void showData(List<Repo> list);

    void showError(String error);

    void showEmptyList();

    String getUserName();
}
