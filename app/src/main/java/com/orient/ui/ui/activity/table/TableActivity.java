package com.orient.ui.ui.activity.table;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.orient.me.widget.rv.adapter.BaseAdapter;
import com.orient.me.widget.rv.adapter.TableAdapter;
import com.orient.me.widget.rv.adapter.TableView;
import com.orient.me.widget.rv.layoutmanager.table.TableLayoutManager;
import com.orient.ui.R;
import com.orient.ui.ui.activity.BaseActivity;
import com.orient.ui.ui.adapter.CommonGridAdapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;

public class TableActivity extends BaseActivity {


    public static void show(Context context) {
        Intent intent = new Intent(context, TableActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.table_activity;
    }

    @Override
    protected void initWidget() {
        super.initWidget();

        /*mTable.setModeAndValue(TableLayoutManager.MODE_A, 4, 8);
        //mTable.setModeAndValue(TableLayoutManager.MODE_B,80,100);
        mTable.setAdapter(mAdapter = new TableAdapter<TableCell>(new ArrayList<>()) {
            @Override
            public int getItemLayout(TableCell tableCell, int pos) {
                switch (tableCell.getType()) {
                    case 2:
                        return R.layout.table_cell_img_item;
                    case 3:
                        return R.layout.table_cell_title_item;
                    case 4:
                        return R.layout.table_cell_edit_item;
                    case 5:
                        return R.layout.table_cell_check_item;
                    case 6:
                        return R.layout.table_cell_camera_item;
                    default:
                        return R.layout.table_cell_content_item;
                }
            }

            @Override
            public BaseAdapter.ViewHolder<TableCell> onCreateViewHolder(View root, int itemType) {
                switch (itemType) {
                    case R.layout.table_cell_img_item:
                        return new ImgHolder(root);
                    case R.layout.table_cell_edit_item:
                        return new EditHolder(root);
                    case R.layout.table_cell_check_item:
                        return new CheckHolder(root);
                    case R.layout.table_cell_camera_item:
                        return new CameraHolder(root);
                    default:
                        return new ViewHOlder(root);
                }
            }
        });

        mTable.post(() -> mTable.reMeasure());*/
    }


    @Override
    protected void initData() {
        super.initData();

        /*List<TableCell> cells = new LinkedList<>();

        cells.add(new TableCell("计划", "1", 3, 0, 0, 1, 1));
        cells.add(new TableCell("周一", "1", 3, 0, 1, 1, 1));
        cells.add(new TableCell("周二", "1", 3, 0, 2, 1, 1));
        cells.add(new TableCell("周三", "1", 3, 0, 3, 1, 1));
        cells.add(new TableCell("周四", "1", 3, 0, 4, 1, 1));
        cells.add(new TableCell("周五", "1", 3, 0, 5, 1, 1));
        cells.add(new TableCell("周六", "1", 3, 0, 6, 1, 1));

        cells.add(new TableCell("P1", "1", 1, 1, 0, 1, 1));
        cells.add(new TableCell("1", "1", 2, 1, 1, 2, 2));
        cells.add(new TableCell("项目一", "1", 1, 1, 3, 1, 1));
        cells.add(new TableCell("项目一", "1", 1, 1, 4, 1, 2));
        cells.add(new TableCell("项目一", "1", 1, 1, 5, 1, 1));
        cells.add(new TableCell("项目一", "1", 1, 1, 6, 1, 1));

        cells.add(new TableCell("P2", "1", 1, 2, 0, 1, 1));
        cells.add(new TableCell("9", "项目二", 6, 2, 3, 1, 1));
        cells.add(new TableCell("11", "项目二", 1, 2, 5, 1, 1));
        cells.add(new TableCell("12", "项目三", 1, 2, 6, 1, 1));

        cells.add(new TableCell("P3", "1", 1, 3, 0, 1, 1));
        cells.add(new TableCell("13", "1", 4, 3, 1, 3, 1));
        cells.add(new TableCell("xxx", "1", 1, 3, 4, 1, 1));
        cells.add(new TableCell("14", "1", 1, 3, 5, 1, 1));
        cells.add(new TableCell("15", "1", 1, 3, 6, 1, 1));

        cells.add(new TableCell("P4", "1", 1, 4, 0, 1, 1));
        cells.add(new TableCell("19", "1", 1, 4, 1, 1, 1));
        cells.add(new TableCell("20", "1", 1, 4, 2, 1, 1));
        cells.add(new TableCell("21", "1", 1, 4, 3, 1, 1));
        cells.add(new TableCell("22", "1", 1, 4, 4, 1, 1));
        cells.add(new TableCell("23", "1", 1, 4, 5, 1, 1));
        cells.add(new TableCell("24", "1", 1, 4, 6, 1, 1));

        cells.add(new TableCell("P5", "1", 1, 5, 0, 1, 1));
        cells.add(new TableCell("25", "1", 5, 5, 1, 1, 1));
        cells.add(new TableCell("26", "1", 5, 5, 2, 1, 1));
        cells.add(new TableCell("27", "1", 5, 5, 3, 1, 1));
        cells.add(new TableCell("28", "1", 5, 5, 4, 1, 1));
        cells.add(new TableCell("29", "1", 5, 5, 5, 1, 1));
        cells.add(new TableCell("30", "1", 5, 5, 6, 1, 1));

        cells.add(new TableCell("P6", "1", 1, 6, 0, 1, 1));
        cells.add(new TableCell("31", "1", 1, 6, 1, 1, 1));
        cells.add(new TableCell("32", "1", 1, 6, 2, 1, 1));
        cells.add(new TableCell("33", "1", 1, 6, 3, 1, 1));
        cells.add(new TableCell("34", "1", 1, 6, 4, 1, 1));
        cells.add(new TableCell("35", "1", 1, 6, 5, 1, 1));
        cells.add(new TableCell("36", "1", 1, 6, 6, 1, 1));

        cells.add(new TableCell("P7", "1", 1, 7, 0, 1, 1));
        cells.add(new TableCell("37", "1", 1, 7, 1, 1, 2));
        cells.add(new TableCell("38", "1", 1, 7, 2, 1, 2));
        cells.add(new TableCell("39", "1", 1, 7, 3, 1, 2));
        cells.add(new TableCell("40", "1", 1, 7, 4, 1, 2));
        cells.add(new TableCell("41", "1", 1, 7, 5, 1, 2));
        cells.add(new TableCell("42", "1", 1, 7, 6, 1, 2));

        cells.add(new TableCell("P8", "1", 1, 8, 0, 1, 1));

        mAdapter.addList(cells);*/

    }

    /*class ViewHOlder extends CommonGridAdapter.ViewHolder<TableCell> {

        //@BindView(R.id.tv_name)
        TextView mNameTv;

        public ViewHOlder(View itemView) {
            super(itemView);
            mNameTv = itemView.findViewById(R.id.tv_name);
        }

        @Override
        protected void onBind(TableCell tableCell) {
            mNameTv.setText(tableCell.getName());
        }
    }

    class ImgHolder extends CommonGridAdapter.ViewHolder<TableCell> {
        ImageView mContent;

        public ImgHolder(View itemView) {
            super(itemView);

            mContent = itemView.findViewById(R.id.iv_content);
        }

        @Override
        protected void onBind(TableCell tableCell) {
            mContent.setImageResource(R.drawable.grid_head_1);
        }
    }

    class EditHolder extends CommonGridAdapter.ViewHolder<TableCell> {
        EditText mContent;

        public EditHolder(View itemView) {
            super(itemView);

            mContent = itemView.findViewById(R.id.et_content);
        }

        @Override
        protected void onBind(TableCell tableCell) {

        }
    }

    class CheckHolder extends CommonGridAdapter.ViewHolder<TableCell>{
        CheckBox mCheckBox;

        public CheckHolder(View itemView) {
            super(itemView);

            mCheckBox = itemView.findViewById(R.id.eb_content);
        }


        @Override
        protected void onBind(TableCell tableCell) {

        }
    }

    class CameraHolder extends CommonGridAdapter.ViewHolder<TableCell>{
        ImageView mCamera;

        public CameraHolder(View itemView) {
            super(itemView);

            mCamera = itemView.findViewById(R.id.iv_camera);
        }


        @Override
        protected void onBind(TableCell tableCell) {

        }
    }*/


}
