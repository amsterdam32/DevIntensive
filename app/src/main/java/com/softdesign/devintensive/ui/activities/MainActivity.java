package com.softdesign.devintensive.ui.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";

    /**
     * метод вызывается при создании активити (после изменения конфигурации/возврата к текущей
     * активности после его уничтожения
     * <p>
     * в данном методе иницилизируется/производится:
     * - UI пользовательский интерфейс (статика)
     * - иницилизация статических данных активити
     * - связь данных со списками (инициализация адаптеров)
     * <p>
     * Не запускать длительные операции по работе с данными в OnCreate() !!!
     *
     * @param savedInstanceState - объкт со значениями сохраненными в Bundle - состояние UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");



        if (savedInstanceState == null) {
            // активити запускается впервые
        } else {
            // активити уже запускалось

        }
    }

    /**
     * метод вызывается при старте активити перед моментом того как UI станет доступен пользователю
     * как правило в данном методе происхоодит регистрация подписок на события остановка которых была
     * произведена в onStop()
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");

    }

    /**
     * Метод вызывается когда активити становится доступна пользователю для взаимодействия.
     * В данном методе как правило происходит запук анимаций/аудио/видео запуск BroadcastReceiver
     * необходимых для реализации UI логики, запуск выполнения потоков и т.д.
     * метод должен быть максимально лекговесным для максимальной отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

    }

    /**
     * метод вызывается когда текущая активити теряет фокус но остается видимой (всплытие
     * диалогового окна/частичное перекрытие другой активити/ и т.д.)
     * <p>
     * в данном методе реализуется сохранение легковесных UI данных/анимаций/аудио/видео и т.д.)
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");

    }

    /**
     * метод вызывается при рестарте активити/возобнавлении работы после вызова метода onStop()
     * в данном методе реализуется специфическая бизнес логика которая должна быть реазлизована именно
     * при рестарте активити - например запрос к серверу который необходимо вызывать при возвращении
     * из другой активити (обновление данных, подписка на определенное событие проинициализированное
     * на другом экране/специфическая бизнес логика завязанная именно на перезапуске активити)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");

    }

    /**
     * метод вызывается когда активити становится невидимым для пользователя.
     * в данном методе происходит отписка от событий, остановка сложных анимаций, сложных операций по
     * сохранению данных/прерываний запущенных потоков и т.д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");

    }

    /**
     * метод вызывается при окончании работы активити (когда это происходит системно или после вызова
     * метода finish() )
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}
