package com.amol.jare.webcomproject.ui.main.holder;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amol.jare.webcomproject.R;
import com.amol.jare.webcomproject.ui.main.model.dataclass.MediaObject;
import com.bumptech.glide.RequestManager;

public class PlayerViewHolder extends RecyclerView.ViewHolder {

    public FrameLayout mediaContainer;
    public ImageView mediaCoverImage, volumeControl, imageView;
    public ProgressBar progressBar;
    public RequestManager requestManager;
    private TextView title, userHandle;
    private View parent;

    public PlayerViewHolder(@NonNull View itemView) {
        super(itemView);
        parent = itemView;
        mediaContainer = itemView.findViewById(R.id.mediaContainer);
        mediaCoverImage = itemView.findViewById(R.id.ivMediaCoverImage);
        title = itemView.findViewById(R.id.tvTitle);
        userHandle = itemView.findViewById(R.id.tvUserHandle);
        progressBar = itemView.findViewById(R.id.progressBar);
        volumeControl = itemView.findViewById(R.id.ivVolumeControl);
        imageView = itemView.findViewById(R.id.imageView);
    }

    public void onBind(MediaObject mediaObject, RequestManager requestManager) {
        this.requestManager = requestManager;
        parent.setTag(this);
        title.setText(mediaObject.getTitle());
        userHandle.setText(mediaObject.getUserHandle());
        this.requestManager
                .load(mediaObject.getCoverUrl())
                .into(mediaCoverImage);
    }
}
