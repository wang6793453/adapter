/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fanwe.lib.adapter;

import android.app.Activity;

import com.fanwe.lib.adapter.data.DataHolder;

public interface Adapter<T>
{
    /**
     * 获得Activity
     *
     * @return
     */
    Activity getActivity();

    /**
     * 调用改变数据的方法之后是否刷新UI，默认-true
     *
     * @param notify
     */
    void setNotifyOnDataChanged(boolean notify);

    /**
     * 刷新position对应的item
     *
     * @param position
     */
    void notifyItemViewChanged(int position);

    /**
     * 返回数据持有者对象
     *
     * @return
     */
    DataHolder<T> getDataHolder();
}
